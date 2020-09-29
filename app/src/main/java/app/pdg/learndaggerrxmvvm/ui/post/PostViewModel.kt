package app.pdg.learndaggerrxmvvm.ui.post

import androidx.lifecycle.MutableLiveData
import app.pdg.learndaggerrxmvvm.post.Post

class PostViewModel {
    private val postTitle = MutableLiveData<String>()
    private val postBody = MutableLiveData<String>()

    fun bind(post: Post){
        postTitle.value = post.title
        postBody.value = post.body
    }

    fun getPostTitle():MutableLiveData<String>{
        return postTitle
    }

    fun getPostBody():MutableLiveData<String>{
        return postBody
    }
}