const Record = require('../src/Record');

describe( 'Record test', () => {

    // declare a variable here so that it's in scope for all the tests
    let record;

    beforeEach(() => {
        // assign a new record object for each test
        record = new Record("Nirvana", "Nevermind", 999);
    })

    test("class and object are defined", () => {
        expect(Record).toBeDefined();
        expect(record).toBeDefined();
    });

    it("should have an artist", function() {
       expect(record.artist).toBe("Nirvana");
    });

    it("should have title", function() {
        expect(record.title).toBe("Nevermind");
    });

    it("should have price", function() {
        expect(record.price).toBe(999);
    });

    it("prints out details as a string", function() {
        expect(record.toPrettyString()).toBe("Artist: Nirvana, Title: Nevermind, Price: £9.99");
    });
})
