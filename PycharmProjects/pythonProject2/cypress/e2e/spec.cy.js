describe('tc1', () => {
  it('Create new account', () => {
    cy.visit('https://magento.softwaretestingboard.com/');
    cy.contains('Create an Account').click();
    cy.get('#firstname').type('Karolina');
    cy.get('#lastname').type('Karolina');
    cy.wait(2000);
    cy.get('input[name=email]').type('Karolina@wp.pl');
    cy.get('#password').type('Karolina123.');
    cy.get('input[name=password_confirmation]').type('Karolina123.');
    cy.get('button').contains('Create an Account').click()
  })
})