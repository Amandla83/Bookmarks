package com.semanticsquare.thrillio;

import com.semanticsquare.thrillio.constants.Gender;
import com.semanticsquare.thrillio.constants.MovieGenre;
import com.semanticsquare.thrillio.constants.UserType;
import com.semanticsquare.thrillio.entities.Bookmark;
import com.semanticsquare.thrillio.entities.User;
import com.semanticsquare.thrillio.entities.UserBookmark;
import com.semanticsquare.thrillio.managers.BookmarkManager;
import com.semanticsquare.thrillio.managers.UserManager;

public class DataStore {
 private static final int USER_BOOKMARK_LIMIT = 5;
private static final int BOOKMARK_COUNT_PERTYPE = 5;
private static final int BOOKMARKS_TYPES_COUNT = 3;
private static final int TOTAL_USER_COUNT = 5;
		
private static User[] users = new User[TOTAL_USER_COUNT]; 
 private static Bookmark[][] bookmarks = new Bookmark[BOOKMARKS_TYPES_COUNT][BOOKMARK_COUNT_PERTYPE]; 
 private static UserBookmark[] userBookmark = new UserBookmark[TOTAL_USER_COUNT*USER_BOOKMARK_LIMIT];
 
 public static void Load_Data() {
	 Load_Users();
	 Load_Web_Link();
	 Load_Movies();
	 Load_Books();
 }
 

private static void Load_Books() {
	// TODO Auto-generated method stub
	
}

private static void Load_Users() {
	
	users[0] = UserManager.getInsatnce().createUser( 1000,"user0@semanticsquare.com", "test", "John", "M", Gender.Male, UserType.USER);
	users[1] = UserManager.getInsatnce().createUser( 1001,"user1@semanticsquare.com", "test", "Sam M", "M", Gender.Male, UserType.USER);
	users[2] = UserManager.getInsatnce().createUser( 1002,"user2@semanticsquare.com", "test", "Anita", "M", Gender.Female, UserType.EDITOR);
	users[3] = UserManager.getInsatnce().createUser( 1003,"user3@semanticsquare.com", "test", "Sara", "M", Gender.Female, UserType.EDITOR);
	users[4] = UserManager.getInsatnce().createUser( 1004,"user4@semanticsquare.com", "test", "Dheeru", "M", Gender.Male, UserType.CHIEF_EDITOR);
}

private static void Load_Web_Link() {
	
	bookmarks[0][0] = BookmarkManager.getInstance().createWeb_Link(2000, "Taming Tiger, Part 2", "http://www.javaworld.com/article/2072759/core-java/taming-tiger--part-2.html", "http://www.javaworld.com");
	bookmarks[0][1] = BookmarkManager.getInstance().createWeb_Link(2001, "How do I import a pre-existing Java project into Eclipse and get up and running?", "http://stackoverflow.com/questions/142863/how-do-i-import-a-pre-existing-java-project-into-eclipse-and-get-up-and-running", "http://www.stackoverflow.com");
	bookmarks[0][2] = BookmarkManager.getInstance().createWeb_Link(2002, "Interface vs Abstract Class", "http://mindprod.com/jgloss/interfacevsabstract.html", "http://mindprod.com	");
	bookmarks[0][3] = BookmarkManager.getInstance().createWeb_Link(2003, "NIO tutorial by Greg Travis", "http://cs.brown.edu/courses/cs161/papers/j-nio-ltr.pdf", "http://cs.brown.edu");
	bookmarks[0][4] = BookmarkManager.getInstance().createWeb_Link(2004, "Virtual Hosting and Tomcat", "http://tomcat.apache.org/tomcat-6.0-doc/virtual-hosting-howto.html"null);
	                  
}

private static void Load_Movies() {
	// TODO Auto-generated method stub
	
	bookmarks[1][0] =  BookmarkManager.getInstance().createMovie(3000,  "Citizen Kane","",1941, new String[] ("Orson Welles", "Joseph Cotten"), new String[] ("Orson Welles"),MovieGenre.CLASSICS,8.5);
	bookmarks[1][1] =  BookmarkManager.getInstance().createMovie(3001,  "The Grapes of Wrath","",1940, new String[] ("Henry Fonda", "Jane Darwell"), new String[] ("John Ford"),MovieGenre.CLASSICS,8.2);
	bookmarks[1][2] =  BookmarkManager.getInstance().createMovie(3002,  "A Touch of Greatness","",2004, new String[] ("Albert Cullum"), new String[] ("Leslie Sullivan"),MovieGenre.DOCUMENTARIES,7.3);
	bookmarks[1][3] =  BookmarkManager.getInstance().createMovie(3003,  "The Big Bang Theory","",2007, new String[] ("Kaley Cuoco", "Jim Parsons"), new String[] ("Chuck Lorre", "Bill Prady"),MovieGenre.TV_SHOWS,8.7);
	bookmarks[1][4] =  BookmarkManager.getInstance().createMovie(3004,  "Ikiru","",1952, new String[] ("Takashi Shimura", "Minoru Chiaki"), new String[] ("Akira Kurosawa"),MovieGenre.FOREIGN_MOVIES,8.4);
	
}

 
}