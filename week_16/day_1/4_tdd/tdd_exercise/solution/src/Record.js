class Record {

    constructor(artist, title, price) {
        this.artist = artist;
        this.title = title;
        this.price = price;
    }

    toPrettyString() {
        return `Artist: ${this.artist}, Title: ${this.title}, Price: £${this.price/100}`;
    }

}

module.exports = Record;