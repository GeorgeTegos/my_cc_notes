class RecordStore {

    constructor(name, city) {
        this.name = name;
        this.city = city;
        this.inventory = [];
        this.balance = 0;
    }

    add(record) {
        // push the record object onto the inventory array
        this.inventory.push(record);
    }

    getInventorySize() {
        return this.inventory.length;
    }

    getBalance() {
        return this.balance;
    }
    
    listInventory() {
        // initialise an empty string
        let inventoryStr = "**** INVENTORY ****\n";

        // push the prettyStrings of the record onto the empty array
        for (let record of this.inventory) {
            inventoryStr += record.toPrettyString() + "\n";
        }

        return inventoryStr;
    }
    
    sellRecordByTitle(recordTitle) {
        // assume the record is not in the inventory
        let foundRecord = null;

        // find the record with a linear search
        for (let i=0; i < this.inventory.length; i++) {
            if (this.inventory[i].title === recordTitle) {
                // set the foundRecord to this record
                foundRecord = this.inventory[i];

                // update the balance
                this.balance += this.inventory[i].price;
            }
        }

        return foundRecord;
    }
    
    calculateStockValue() {
        // initialise the stock value to 0
        let stockValue = 0;

        // add the price of each record to the stock value
        for (let record of this.inventory) {
          stockValue += record.price;
        };

        return stockValue;
    }
    
    financeReport() {
        return `Current Balance: ${this.balance} Current Stock Value: ${this.calculateStockValue()}`;
    }

}

module.exports = RecordStore;