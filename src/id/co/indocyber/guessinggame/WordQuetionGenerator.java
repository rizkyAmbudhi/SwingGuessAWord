/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package id.co.indocyber.guessinggame;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author user
 */
public class WordQuetionGenerator {
      
    public static WordModel[] createQuetion(){
    WordModel soal1 = new WordModel("Pondok indah","Daerah dijakarta selatan");
    WordModel soal2 = new WordModel ("Sudirman","Jalan utama dijakarta");
    WordModel soal3 = new WordModel("Tugu Tani","Deket Monas");
    WordModel soal4 = new WordModel ("Citos","Mall pinggir tol di jakarta selatan");
    WordModel soal5 = new WordModel ("IndoCyber","nama Perusahaan");
    WordModel[] bankSoal = {soal1,soal2,soal3,soal4,soal5};
    return bankSoal;    
}

    public static List <WordModel> createQuetionCollection(){
        WordModel soal1 = new WordModel("Pondok indah","Daerah dijakarta selatan");
        WordModel soal2 = new WordModel ("Sudirman","Jalan utama dijakarta");
        WordModel soal3 = new WordModel("Tugu Tani","Deket Monas");
        WordModel soal4 = new WordModel ("Citos","Mall pinggir tol di jakarta selatan");
        WordModel soal5 = new WordModel ("IndoCyber","nama Perusahaan");
        WordModel [] bankSoal = {soal1,soal2,soal3,soal4,soal5};
        List<WordModel> banksoal = new ArrayList<>();
        banksoal.add(soal1);
        banksoal.add(soal2);
        banksoal.add(soal3);
        banksoal.add(soal4);
        banksoal.add(soal5);
        return banksoal;

}
    public static List<WordModel> createQuestionFromFile() throws FileNotFoundException, IOException{
        List<WordModel> bankSoal = new ArrayList<>();
        File file = new File("C:/JAVA_lATIHAN/question.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader reader = new BufferedReader(fileReader);
        List<WordModel> quetion = new ArrayList<>();
        String line = null;
        while ((line = reader.readLine()) != null){
            System.out.println(line);
            //split line, ass
            String[] QuetionSplit = line.split(",");
            //buat object quetion model, array index [0] kata dasar, index [1] untuk petunjuk
            WordModel split = new WordModel(QuetionSplit[0], QuetionSplit[1].trim());
            //add ke question
            //Periksa ukuran collection quetion
            bankSoal.add(split);
        }
        Collections.sort(quetion);
        return bankSoal;
       
        
    }
    
    }

