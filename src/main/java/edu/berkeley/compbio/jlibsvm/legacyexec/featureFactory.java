/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.berkeley.compbio.jlibsvm.legacyexec;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author skhokhar
 */
public class featureFactory {
    
    // read text file of gps tracks
    // convert to meters
    // compute angular velocity, linear acceleration
    // train svms for left right straight
    
   
//    double[] gpsLocs = 
    List<Double> gpsloclist = new ArrayList<Double>();
    try {
            BufferedReader filereader;
        try {
            filereader = new BufferedReader(new FileReader("/home/skhokhar/workspace/trackManipulation/rsc/text_files/Ellis_National_GPS_061714_152841_001.txt"));
            String line;
                try {
                    while((line = filereader.readLine()) != null)
                        
                    {
                        
                        System.out.println(line);
                        String[] parts = line.split(" ");
                        
                    }
                } catch (IOException ex) {
                    Logger.getLogger(featureFactory.class.getName()).log(Level.SEVERE, null, ex);
                }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(featureFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
        
          
        
    }
