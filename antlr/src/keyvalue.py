
from antlr_unit import Grammars, Grammar, Lexers, Lexer, Test

@Grammars
def keyvalue():
    return Grammar('keyvalue', "STRING ':' STRING")

@Lexers
def STRING():
    return Lexer('STRING', '~[:]+', fragment=False)

@Test
def keyvalue_test(ctx):
    test_source = 'name: Luncert'
    ctx.test('keyvalue', test_source, requires=('STRING', ), tokens=True, trace=True)