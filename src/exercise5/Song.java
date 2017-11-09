package exercise5;

/**
 * Class Song
 * Task 7: Create a class Song with the following private data members: String title, String artist.
 * Implement method equals. Two objects of type Song are equal if their titles and artists are equal.
 * Implement method hashCode. Hash code of an object is calculated as follows: numeric value of each letter in the title of a song is multiplied by that letter's position in the title and added to the accumulator (integer). Numeric value of each letter in the artist of a song is multiplied by that letter's position in the artist and added to the accumulator.
 * @author yasiro01
 */
public class Song {
  private String title;
  private String artist;
  
  public Song(String title, String artist){
      this.title = title;
      this.artist = artist;
  }
  
  public boolean equals(Song song1, Song song2){
    if (song2.title == song1.title){
     if (song2.artist == song1.artist){
        return true;
    }
     else{
         return false;
     }
    }
    else{
        return false;
    }
}
  public int hashCode() {
      int total = 0;
    for (int i = 0; i <= title.length(); i++){
        total = total + (i * Integer.valueOf(title.charAt(i)));
    }
    for (int i = 0; i <= artist.length(); i++){
        total = total + (i * Integer.valueOf(artist.charAt(i)));
    }
    return total;
}
  public String getTitle(){
        return title;
    }
  public String getArtist(){
        return artist;
    }
}
