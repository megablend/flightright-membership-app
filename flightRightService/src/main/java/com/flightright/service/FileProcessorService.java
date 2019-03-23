/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.flightright.service;

import java.io.InputStream;

/**
 *
 * @author Megafu Charles <noniboycharsy@gmail.com>
 */
public interface FileProcessorService {
    
    /**
     * Creates the pictures folder if it does not exist
     * @param picturesPath 
     */
    void createPicturesFolder(String picturesPath);
    
    /**
     * Store a picture
     * @param file
     * @param fileDetails
     * @param picturePath
     * @return 
     */
    String storePicture(InputStream file, String[] fileDetails, String picturePath);
    
    /**
     * Update a picture
     * @param file
     * @param oldFileName
     * @param picturePath
     * @return 
     */
    boolean updatePicture(InputStream file, String oldFileName, String picturePath);
    
    /**
     * Renames a file
     * @param fileDetails
     * @return 
     */
    String renameFile(String[] fileDetails);
    
    /**
     * Delete a member's picture
     * @param fileName
     * @return 
     */
    void deletePicture(String fileName);
}
