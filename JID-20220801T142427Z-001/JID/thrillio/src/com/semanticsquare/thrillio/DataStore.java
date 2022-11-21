package com.semanticsquare.thrillio;

import com.semanticsquare.thrillio.constants.Gender;
import com.semanticsquare.thrillio.constants.UserType;
import com.semanticsquare.thrillio.entities.Bookmark;
import com.semanticsquare.thrillio.entities.User;
import com.semanticsquare.thrillio.entities.UserBookmark;
import com.semanticsquare.thrillio.managers.UserManager;

public class DataStore {
 private static final int USER_BOOKMARK_LIMIT = 5;
private static final int BOOKMARK_COUNT_PERTYPE = 5;
private static final int BOOKMARKS_TYPES_COUNT = 3;
private static final int TOTAL_USER_COUNT = 5;
		
private static User[] users = new User[TOTAL_USER_COUNT]; 
 private static Bookmark[][] bookmarks = new Bookmark[BOOKMARKS_TYPES_COUNT][BOOKMARK_COUNT_PERTYPE]; 
 private static UserBookmark[] userBookmarks = new UserBookmark[TOTAL_USER_COUNT*USER_BOOKMARK_LIMIT];
 
 public static void Load_Data() {
	 Load_Users();
	 Load_Web_Link();
 }
 
private static void Load_Users() {
	
	users[0] = UserManager.getInsatnce().createUser( 1000,"user0@semanticsquare.com", "test", "John", "M", Gender.Male, UserType.USER);
	users[1] = UserManager.getInsatnce().createUser( 1001,"user1@semanticsquare.com", "test", "Sam M", "M", Gender.Male, UserType.USER);
	users[2] = UserManager.getInsatnce().createUser( 1002,"user2@semanticsquare.com", "test", "Anita", "M", Gender.Female, UserType.EDITOR);
	users[3] = UserManager.getInsatnce().createUser( 1003,"user3@semanticsquare.com", "test", "Sara", "M", Gender.Female, UserType.EDITOR);
	users[4] = UserManager.getInsatnce().createUser( 1004,"user4@semanticsquare.com", "test", "Dheeru", "M", Gender.Male, UserType.CHIEF_EDITOR);
}
private static void Load_Web_Link() {
	                  
}
 
}