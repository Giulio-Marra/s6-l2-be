package giulio_marra.s6_l2_be.service;

import giulio_marra.s6_l2_be.entities.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class PostService {

    private List<Post> postList = new ArrayList<>();

    public List<Post> getPostList() {
        return postList;
    }

    public Post savePost(Post body) {
        postList.add(body);
        System.out.println("Post salvato");
        return body;
    }

    public Post getPostById(long id) {
        for (Post post : postList) {
            if (post.getId() == id) {
                return post;
            }
        }
        throw new IllegalArgumentException("Post non trovato per l'ID: " + id);
    }

    public void deletePostById(long id) {
        Iterator<Post> iterator = postList.iterator();
        while (iterator.hasNext()) {
            Post post = iterator.next();
            if (post.getId() == id) {
                iterator.remove();
                return;
            }
        }
        throw new IllegalArgumentException("Post non trovato per l'ID: " + id);
    }

    public Post findAndUpdatePost(long id, Post updatePost) {
        for (Post post : postList) {
            if (post.getId() == id) {
                post.setCategorie(updatePost.getCategorie());
                post.setContenuto(updatePost.getContenuto());
                post.setCover(updatePost.getCover());
                post.setTitolo(updatePost.getTitolo());
                post.setTempo_di_lettura(updatePost.getTempo_di_lettura());
                return post;
            }
        }
        throw new IllegalArgumentException("Post non trovato per l'ID: " + id);
    }
}
