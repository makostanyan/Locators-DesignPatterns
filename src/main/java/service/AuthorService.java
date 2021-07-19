package service;

import model.Author;

public class AuthorService {

    public static final String AUTHOR_NAME = "author.name";

    public static Author authorData(){
        return new Author(TestDataReader.getTestData(AUTHOR_NAME));
    }
}
