package com.studenti.uninsubria.emotionalsongs.ClientES.Model;

public class EmozioneProvabileModel {

    // <editor-fold desc="Attributi">

    private short emozioneID;
    private String nomeEmozione;

    // </editor-fold>

    // <editor-fold desc="Costruttori">

    public EmozioneProvabileModel() {

    }

    public EmozioneProvabileModel(short emozioneID, String nomeEmozione) {
        this.emozioneID = emozioneID;
        this.nomeEmozione = nomeEmozione;
    }

    // </editor-fold>

    // <editor-fold desc="Getters & Setters">

    /**
     * Legge emozioniID
     * @return
     */

    public short getEmozioneID() {
        return emozioneID;
    }

    /**
     * Assegna emozioniID
     * @param emozioneID
     */

    public void setEmozioneID(short emozioneID) {
        this.emozioneID = emozioneID;
    }

    /**
     * Legge nomeEmozione
     * @return
     */

    public String getNomeEmozione() {
        return nomeEmozione;
    }

    /**
     * Assegna nomeEmozione
     * @param nomeEmozione
     */

    public void setNomeEmozione(String nomeEmozione) {
        this.nomeEmozione = nomeEmozione;
    }

    // </editor-fold>

}
