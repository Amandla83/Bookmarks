package com.semanticsquare.thrillio.managers;

import com.semanticsquare.thrillio.dao.BookmarkDao;
import com.semanticsquare.thrillio.entities.Book;
import com.semanticsquare.thrillio.entities.Bookmark;
import com.semanticsquare.thrillio.entities.Movie;
import com.semanticsquare.thrillio.entities.WebLink;

public class BookmarkManager {
	private static BookmarkManager instance = new BookmarkManager();
	private static BookmarkDao dao = new BookmarkDao();

	private BookmarkManager() {

	}

	public static BookmarkManager getInstance() {
		return instance;
	}
	
	public WebLink createWeb_Link(String url,String host,long id,String tittle,String profileUrl) {
		WebLink weblink = new WebLink();
		weblink.setUrl(url);
		weblink.setHost(host);
		weblink.setId(id);
		weblink.setTittle(tittle);
		weblink.setProfileUrl(profileUrl);
		
		return weblink;
		
		
	}
	
	
	
	public Book createBook(int publicationYear,String publisher,String[] authors,String[] genre,double amazonRating,long id,String tittle,String profileUrl){ 
		
		Book book = new Book();
		book.setPublicationYear(publicationYear);
		book.setPublisher(publisher);
		book.setAuthors(authors);
		book.setGenre(genre);
		book.setAmazonRating(amazonRating);
		book.setId(id);
		book.setTittle(tittle);
		book.setProfileUrl(profileUrl);
		
		
		return book;
		
		

	}

	public Movie createMovie(long id, String tittle, String profileUrl, int releaseYear, String[] cast,
			String[] directors, String genre, double imdbRating) {
		Movie movie = new Movie();
		movie.setId(id);
		movie.setTittle(tittle);
		movie.setProfileUrl(profileUrl);
		movie.setReleaseYear(releaseYear);
		movie.setCast(cast);
		movie.setDirectors(directors);
		movie.setGenre(genre);
		movie.setImdbRating(imdbRating);
		
		return movie;

	}
	
	public Bookmark[][] getBookmarks(){
		
		return dao.getBookmarks();
	}

	public Bookmark createWeb_Link(int i, String string, String string2, String string3) {
		// TODO Auto-generated method stub
		return null;
	}

	public Bookmark createWeb_Link(int i, String string, String string2) {
		// TODO Auto-generated method stub
		return null;
	}

	public Bookmark createMovie(int i, String string, int j, String string2, String string3, String documentaries,
			double d) {
		// TODO Auto-generated method stub
		return null;
	}
}
