describe("App", () => {
  beforeEach(() => {
    cy.visit("http://localhost:3000");
  });

  it("Loads the App", () => {
    const counter = cy.get("h1");
    counter.should("contain", "0");
  });
});
