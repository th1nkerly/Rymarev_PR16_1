package com.example.pr20

import com.google.firebase.database.Exclude
import com.google.firebase.database.IgnoreExtraProperties


@IgnoreExtraProperties
class User(var username: String?, var email: String?) {

}

@IgnoreExtraProperties
class Post {
    var uid: String? = null
    var author: String? = null
    var title: String? = null
    var body: String? = null
    var starCount: Int = 0
    var stars: Map<String, Boolean> = HashMap()

    constructor()
    constructor(uid: String?, author: String?, title: String?, body: String?) {
        this.uid = uid
        this.author = author
        this.title = title
        this.body = body
    }

    @Exclude
    fun toMap(): Map<String, Any?> {
        val result = HashMap<String, Any?>()
        result["uid"] = uid
        result["author"] = author
        result["title"] = title
        result["body"] = body
        result["starCount"] = starCount
        result["stars"] = stars
        return result
    }
}

