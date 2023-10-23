describe("Comment", () => {
  beforeEach(() => {
    cy.visit("http://localhost:3000");
  });

  it("Should have populated the comments list", () => {
    const commentListItems = cy.get("#comment-list > li");
    commentListItems.should("have.length", 2);
  });

  it("Should add a comment when form submitted", () => {
    cy.get("#name-input").type("Jason");
    cy.get("#comment-input").type("This is awesome");
    cy.get("#comment-form").submit();

    //assert

    const commentListItems = cy.get("#comment-list > li");
    commentListItems.should("have.length", 3);
  });
});
