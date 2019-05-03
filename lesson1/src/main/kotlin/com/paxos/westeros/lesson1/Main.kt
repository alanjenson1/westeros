package com.paxos.westeros.lesson1

import marytts.LocalMaryInterface
import javax.sound.sampled.AudioSystem
import java.io.File
import javax.sound.sampled.AudioInputStream
import javax.sound.sampled.Clip

val mary = LocalMaryInterface()

fun main() {
    val dingDingDing = makeResourceClip("/dingdingding.wav")
    val shameShameShame = makeResourceClip("/shameShameShame.wav")
    val extraShameName = makeTtsClip("shame")
    val myName = makeTtsClip("sharon")

    playClip(dingDingDing)
    playClip(shameShameShame)
    playClip(dingDingDing)
    for (i in 0..3){
        playClip(extraShameName)
    }
    playClip(myName)

    dingDingDing.close()
    shameShameShame.close()
    extraShameName.close()
    myName.close()
}

private fun playClip(clip: Clip){
    clip.framePosition = 0
    clip.microsecondPosition = 0
    clip.start()
    Thread.sleep(clip.microsecondLength/1000)
    clip.stop()
}

private fun makeResourceClip(resourceName : String): Clip{
    val uri = AudioSystem::class.java.getResource(resourceName).toURI()
    val audioInputStream = AudioSystem.getAudioInputStream(File(uri).absoluteFile)
    return makeClip(audioInputStream)
}

private fun makeTtsClip(textToSpeech : String): Clip{
    return makeClip(mary.generateAudio(textToSpeech))
}

private fun makeClip(inputStream: AudioInputStream): Clip{
    val clip = AudioSystem.getClip()
    clip.open(inputStream)
    return clip
}
