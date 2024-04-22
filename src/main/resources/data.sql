INSERT INTO book (book_title, book_author, book_publication_year, book_isbn, book_publisher) VALUES
                                                                                                 ('Title 1', 'Author 1', 2001, 456456, 'Publisher 1'),
                                                                                                 ('Title 2', 'Author 2', 2002, 789789, 'Publisher 2'),
                                                                                                 ('Title 3', 'Author 3', 2003, 101112, 'Publisher 3'),
                                                                                                 ('Title 4', 'Author 4', 2004, 131415, 'Publisher 4'),
                                                                                                 ('Title 5', 'Author 5', 2005, 161718, 'Publisher 5');

INSERT INTO patron (patron_first_name, patron_last_name, patron_nationality_id, patron_phone, patron_mail,patron_addres) VALUES
                                                                                 ('John', 'Doe', '1234567890', '1234567890', 'john.doe@example.com', '123 Main Street'),
                                                                                 ('Jane', 'Smith', '0987654321', '0987654321', 'jane.smith@example.com', '456 Elm Street'),
                                                                                 ('Michael', 'Johnson', '1357924680', '1357924680', 'michael.johnson@example.com', '789 Oak Avenue'),
                                                                                 ('Emma', 'Williams', '2468135790', '2468135790', 'emma.williams@example.com', '321 Maple Lane'),
                                                                                 ('Christopher', 'Brown', '9876543210', '9876543210', 'christopher.brown@example.com', '654 Pine Road');

INSERT INTO borrowing (patron_id, book_id) VALUES
                                              (1,5),
                                              (2,4),
                                              (3,3),
                                              (4,2),
                                              (5,1);
