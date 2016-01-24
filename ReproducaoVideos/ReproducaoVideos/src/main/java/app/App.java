/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import util.AVI;
import util.FormatoVideo;
import util.MP3;
import util.MP4;

/**
 *
 * @author dell
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FormatoVideo mp3 = new MP3();
        mp3.executarVideo();

        FormatoVideo mp4 = new MP4();
        mp4.executarVideo();

        FormatoVideo avi = new AVI();
        avi.executarVideo();
    }
    
}
