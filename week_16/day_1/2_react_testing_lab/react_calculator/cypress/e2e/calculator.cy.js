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
});
