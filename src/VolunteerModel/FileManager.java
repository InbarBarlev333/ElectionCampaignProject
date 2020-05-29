package VolunteerModel;

import java.io.*;
import java.util.HashSet;
import java.util.Set;


class FileManager<T> {

    private String filename;

    public FileManager(String filename) {
        this.filename = filename;
    }

    private boolean isFileExists() {
        File file = new File(filename);
        return file.exists();
    }

    public void write(Set<T> object) {
        try (FileOutputStream fos = new FileOutputStream(this.filename);
             ObjectOutputStream oos = new ObjectOutputStream(fos);) {
            // Write the object to the stream and then flush
            oos.writeObject(object);
            oos.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    } // End of writeObjectToFile( )

    //public Set<T> read() throws FileNotFoundException, IOException, ClassNotFoundException {
    //   if (!isFileExists()) { // Return empty set when file is not exists
    //       return (Set<T>) new HashSet<T>();
    //   }

    //   try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(this.filename))) {
    //       return (Set<T>) objectInputStream.readObject();
    //   }
    //}
    public Set<T> read() {
        File file = new File(this.filename);
        if (!file.exists()) { // Return empty set when file is not exists
            return new HashSet<>();
        }
        if (file.exists() && file.length() > 0) {
            // Try-with-resources, one filestream and one objectstream
            try (FileInputStream fis = new FileInputStream(file);
                 ObjectInputStream ois = new ObjectInputStream(fis);) {
                // Return whatever object we read.
                return (Set<T>) ois.readObject();
            } catch (IOException | ClassNotFoundException ex) {
                ex.printStackTrace();
            }
        }
        return null;
        // If there is no file or nothing in it, return null.


    }
}

