package com.plcoding.spotifycloneyt.other


/**
 * Created by Abhinay on 20/05/24.
 * adriti
 * abhinay212@gmail.com
 */
open class Event<out T>(private val data: T) {
    var hasBeenHendled = false
        private set

    fun getContentIfNotHandled(): T? {
            return if(hasBeenHendled) {
                    null
            } else {
                hasBeenHendled = true
                data
            }
    }

    fun peekContent() = data

}