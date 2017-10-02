/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package id.co.indocyber.guessinggame;

import java.util.Arrays;

/**
 *
 * @author user
 */
public class TebakModel {
    private String basicWord;
    private String soal;
    private String hint;
    private String Jawaban;

    public TebakModel(String basicWord, String hint) {
        this.basicWord = basicWord;
        this.hint = hint;
    }

    public String createSoal(){
         
        String KataKunci = basicWord.toUpperCase();
        char[] vokal = {'A','I','U','E','O'};
        
        for (int i = 0; i < vokal.length; i++) {
            KataKunci = KataKunci.replace(vokal[i], '_');
        }
        return KataKunci;
        
    }
    
    public boolean cekJawaban(){
        boolean hasil = false;
        if(getJawaban().equalsIgnoreCase(getBasicWord())){
            hasil=true;
        } return hasil;
    }

    /**
     * @return the basicWord
     */
    public String getBasicWord() {
        return basicWord;
    }

    /**
     * @param basicWord the basicWord to set
     */
    public void setBasicWord(String basicWord) {
        this.basicWord = basicWord;
    }

    /**
     * @return the soal
     */
    public String getSoal() {
        return soal;
    }

    /**
     * @param soal the soal to set
     */
    public void setSoal(String soal) {
        this.soal = soal;
    }

    /**
     * @return the hint
     */
    public String getHint() {
        return hint;
    }

    /**
     * @param hint the hint to set
     */
    public void setHint(String hint) {
        this.hint = hint;
    }

    /**
     * @return the Jawaban
     */
    public String getJawaban() {
        return Jawaban;
    }

    /**
     * @param Jawaban the Jawaban to set
     */
    public void setJawaban(String Jawaban) {
        this.Jawaban = Jawaban;
    }
    
}
