class book:
    def __init__(self, publisher, publication_date, isbn):
        self.publisher = publisher
        self.publication_date = publication_date
        self.isbn = isbn

class NumberedComponent:
    def __init__(self, title, number):
        self.title = title
        self.number = number

class part(NumberedComponent):
    def __init__(self,title, number):
        super().__init(title, number)

class chapter(NumberedComponent):
    def __init__(self, title, number, abstract):
        self.abstract = abstract
        super().__init__(title, number)

class section(NumberedComponent):
    def __init__(self, title, number):
        super().__init__(title, number)