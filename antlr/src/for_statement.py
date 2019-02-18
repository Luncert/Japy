
from antlr_unit import Grammars, Test

@Grammars
def for_statement():
    return {}

@Test
def for_statement_test(ctx):
    print('test')