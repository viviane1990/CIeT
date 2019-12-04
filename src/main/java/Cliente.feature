#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Title of your feature
  I want to use this template for my feature file

  Scenario: Comprar usando o buscar produto
    Given efetuei login no sistema
    And na tela Promocao pesquiso produto
    And na tela de resultados da pesquisa, seleciono produto 
    When adiciono no carrinho 
    And informo de pagamento no cartao de credito
    Then sera exibida o valor total da compra

    
   Scenario: Comprar de dois produtos iguais
		Given pesquiso produto
		When adiciono produto no carrinho
		And altero quantidade do produto
		Then sera exibido o carrinho com dois produtos iguais 
	
    Scenario: Excluir um produto
		Given visualizo o carrinho
		When clico em excluir produto 
		Then será exibido dois itens no carrinho
