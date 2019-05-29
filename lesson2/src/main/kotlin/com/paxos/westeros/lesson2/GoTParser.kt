package com.paxos.westeros.lesson2

import com.google.gson.Gson
import java.nio.file.Files
import java.nio.file.Paths

class GoTParser {
    private val gson = Gson()
    private val charactersPath = "/data/characters.json"
    private val gendersPath = "/data/characters-gender.json"


    fun parseCast(): Cast {
        val uri = GoTParser::class.java.getResource(charactersPath).toURI()
        val string = String(Files.readAllBytes(Paths.get(uri)))
        return gson.fromJson(string, Cast::class.java)
    }

    fun parseGenders(): GenderBinary {
        val uri = GoTParser::class.java.getResource(gendersPath).toURI()
        val string = String(Files.readAllBytes(Paths.get(uri)))
        return gson.fromJson(string, GenderBinary::class.java)
    }
}
