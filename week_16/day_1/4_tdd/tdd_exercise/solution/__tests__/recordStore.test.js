const RecordStore = require('../src/RecordStore');
const Record = require('../src/Record');

describe( "RecordStore", () => {

    // these need to be declared here so that they are in scope for all the test functions
    let recordStore;
    let record1;
    let record2;

    beforeEach( () => {
        // assign values to the variables
        recordStore = new RecordStore("Rockin Rudy's", "Missoula");
        record1 = new Record("Nirvana", "Nevermind", 999);
        record2 = new Record("Red Hot Chilli Peppers", "By The Way", 799);
    })

    test("Classes are defined", () => {
        expect(RecordStore).toBeDefined();
        expect(Record).toBeDefined();
    });

    it("should start with an empty inventory", () => {
        expect(recordStore.getInventorySize()).toBe(0);
    })

    it("should start with an empty inventory", () => {
        expect(recordStore.getBalance()).toBe(0);
    })

    it("should add a `Record` to it's inventory", () => {
        recordStore.add(record1);
        recordStore.add(record2);
        expect(recordStore.getInventorySize()).toBe(2);
    })

    it("should return an array of all of its records pretty strings", () => {
        recordStore.add(record1);
        recordStore.add(record2);
        expect(recordStore.listInventory()).toBe("**** INVENTORY ****\nArtist: Nirvana, Title: Nevermind, Price: £9.99\nArtist: Red Hot Chilli Peppers, Title: By The Way, Price: £7.99\n")
    })

    it("should sell a record if the title exists in the inventory", () => {
        recordStore.add(record1);
        recordStore.add(record2);
        recordStore.sellRecordByTitle("Nevermind");
        recordStore.sellRecordByTitle("By The Way");
        expect(recordStore.getBalance()).toBe(1798);
    })

    it("should return its entire stock value", () => {
        expect(recordStore.calculateStockValue()).toBe(0);
        recordStore.add(record1);
        recordStore.add(record2);
        expect(recordStore.calculateStockValue()).toBe(1798);
    })

    it("should return a finance report", () => {
        recordStore.add(record1);
        recordStore.add(record2);
        recordStore.sellRecordByTitle("Nevermind");
        expect(recordStore.financeReport()).toBe("Current Balance: 999 Current Stock Value: 1798");
    })

})
