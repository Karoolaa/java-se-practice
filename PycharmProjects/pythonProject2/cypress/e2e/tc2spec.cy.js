describe('tc2', () => {
    it('Add product to cart', () => {
      cy.visit('https://magento.softwaretestingboard.com/');
      cy.contains('Women').click();
      cy.contains('Jackets').click({ force: true });
      cy.contains('Olivia 1/4 Zip Light Jacket').click({ force: true });
      cy.contains('XS').click();
      cy.get('div[id=option-label-color-93-item-49]').click();
      cy.contains('Add to Cart').click();
      cy.wait(2000)
      cy.get('div[data-block="minicart"]').click();
    })
  })