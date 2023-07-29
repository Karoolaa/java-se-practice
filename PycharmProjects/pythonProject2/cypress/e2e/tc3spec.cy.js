describe('tc3', () => {
    it('Add new review to the product', () => {
      cy.visit('https://magento.softwaretestingboard.com/');
      cy.get('li[class="level0 nav-3 category-item level-top parent ui-menu-item"]').click();
      cy.get('#maincontent > div.columns > div.sidebar.sidebar-main > div.widget.block.block-static-block > div > ul:nth-child(2) > li:nth-child(2) > a').click();
      cy.contains('Montana Wind Jacket').click({ force: true });
      cy.contains('Add Your Review').click();
      cy.get("#Rating_3_label").click({force: true})
      cy.get('input[name=nickname').type('Karolina');
      cy.get('input[name=title').type('Karolina');
      cy.get("#review_field").type('Karolina');
      cy.contains('Submit Review').click();
    })
  })