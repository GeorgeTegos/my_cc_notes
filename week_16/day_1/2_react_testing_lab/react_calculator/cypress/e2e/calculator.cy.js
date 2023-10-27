describe("Calculator", () => {
  beforeEach(() => {
    cy.visit("http://localhost:3000");
  });

  it("should have working number buttons", () => {
    cy.get("#number2").click();
    cy.get(".display").should("contain", "2");
  });

  it("should operators update the display", () => {
    cy.get("#number2").click();
    cy.get("#operator_add").click();
    cy.get("#number2").click();
    cy.get("#operator-equals").click();
    cy.get(".display").should("contain", "4");
  });

  it("should chain multiple operations", () => {
    cy.get("#number3").click();
    cy.get("#operator_add").click();
    cy.get("#number1").click();
    cy.get("#operator-subtract").click();
    cy.get("#number2").click();
    cy.get("#operator-equals").click();
    cy.get(".display").should("contain", "2");
  });

  it("should have correct outcome for positive numbers", () => {
    cy.get("#number3").click();
    cy.get("#operator_add").click();
    cy.get("#number5").click();
    cy.get("#operator-equals").click();
    cy.get(".display").should("contain", "8");
  });

  it("should have correct outcome for negative numbers", () => {
    cy.get("#number3").click();
    cy.get("#operator-subtract").click();
    cy.get("#number5").click();
    cy.get("#operator-equals").click();
    cy.get(".display").should("contain", "-2");
  });

  it("should have correct outcome for float numbers", () => {
    cy.get("#number3").click();
    cy.get("#operator-divide").click();
    cy.get("#number2").click();
    cy.get("#operator-equals").click();
    cy.get(".display").should("contain", "1.5");
  });

  it("should have correct outcome for large numbers", () => {
    cy.get("#number5").click();
    cy.get("#operator-multiply").click();
    cy.get("#number5").click();
    cy.get("#number5").click();
    cy.get("#number5").click();
    cy.get("#operator-multiply").click();
    cy.get("#number1").click();
    cy.get("#number0").click();
    cy.get("#number0").click();
    cy.get("#operator-equals").click();
    cy.get(".display").should("contain", "277500");
  });

  it("should not divide by 0 and keep the previous total number", () => {
    cy.get("#number5").click();
    cy.get("#operator-divide").click();
    cy.get("#number0").click();
    cy.get("#operator-equals").click();
    cy.on("window:alert", (t) => {
      expect(t).to.contains("Can't divide by 0");
    });
    cy.get(".display").should("contain", "5");
  });
});
