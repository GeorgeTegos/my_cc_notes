class SandwichDeal {
	constructor(bread, toppings = [], soup = undefined) {
		this.bread = bread;
		this.toppings = toppings;
		this.soup = soup;
	}
	describe(customerName) {
		return `For ${customerName}. Sandwich \non ${this.bread} bread, with: ${this.toppings}`;
	}
}

// const ruben = new SandwichDeal("rye", ["cheese", "tomato"]);
// console.log(ruben.describe("Pim"));
// const pawelSpecial = new SandwichDeal("rye");
// console.log(pawelSpecial.describe("Pim"));

module.exports = SandwichDeal