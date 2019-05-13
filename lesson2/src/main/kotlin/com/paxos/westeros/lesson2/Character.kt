package com.paxos.westeros.lesson2

class Character(
        private val characterName: String,
        private val nickname: String?,
        private val characterImageThumb: String?,
        private val characterImageFull: String?,
        private val actorName: String?,
        private val actors: List<Actor>?,
        private val houseName: String?,
        private val houseNames: List<String>?,
        private val royal: Boolean = false,
        private val kingsguard: Boolean = false,
        private val parents: List<String>?,
        private val parentOf: List<String>?,
        private val siblings: List<String>?,
        private val marriedEngaged: List<String>?,
        private val killed: List<String>?,
        private val killedBy: List<String>?,
        private val serves: List<String>?,
        private val servedBy: List<String>?,
        private val guardianOf: List<String>?,
        private val gaurdedBy: List<String>?
)
