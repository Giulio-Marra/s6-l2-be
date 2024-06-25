package giulio_marra.s6_l2_be.controller;

import giulio_marra.s6_l2_be.entities.Post;
import giulio_marra.s6_l2_be.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/post")
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping
    public List<Post> getPosts() {
        return postService.getPostList();
    }

    @GetMapping("/{id}")
    public Post getPost(@PathVariable long id) {
        return postService.getPostById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Post savePost(@RequestBody Post body) {
        return postService.savePost(body);
    }

    @DeleteMapping("/{id}")
    public void deletePost(@PathVariable long id) {
        postService.deletePostById(id);
    }

    @PutMapping("/{id}")
    public Post getPostAndUpdate(@PathVariable long id, @RequestBody Post body) {
        return postService.findAndUpdatePost(id, body);
    }
}
