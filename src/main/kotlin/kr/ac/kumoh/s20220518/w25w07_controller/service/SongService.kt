package kr.ac.kumoh.s20220518.w25w07_controller.service

import kr.ac.kumoh.s20220518.w25w07_controller.model.Song
import org.springframework.stereotype.Service

@Service
class SongService {
    fun getAllSongs(): List<Song> {
        return listOf(
            Song(1,"Golden","HUNTER/X")
        )
    }
}