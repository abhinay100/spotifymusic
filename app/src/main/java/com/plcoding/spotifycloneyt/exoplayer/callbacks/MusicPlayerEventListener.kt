package com.plcoding.spotifycloneyt.exoplayer.callbacks

import android.widget.Toast
import com.google.android.exoplayer2.ExoPlaybackException
import com.google.android.exoplayer2.Player
import com.plcoding.spotifycloneyt.exoplayer.MusicService


/**
 * Created by Abhinay on 16/05/24.
 * abhi
 * abhinay212@gmail.com
 */
class MusicPlayerEventListener(
    private val musicService: MusicService
): Player.EventListener {

    override fun onPlayerStateChanged(playWhenReady: Boolean, playbackState: Int) {
        super.onPlayerStateChanged(playWhenReady, playbackState)
        if(playbackState == Player.STATE_READY && !playWhenReady) {
            musicService.stopForeground(false)
        }
    }

    override fun onPlayerError(error: ExoPlaybackException) {
        super.onPlayerError(error)
        Toast.makeText(musicService, "An unknown error occured", Toast.LENGTH_LONG).show()
    }
}