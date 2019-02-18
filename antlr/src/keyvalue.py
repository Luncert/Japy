
from antlr_unit import Grammars, Test

@Grammars
def keyvalue():
    grs = {}
    grs['keyvalue'] = "STRING ':' STRING"
    grs['STRING'] = "~[:]*"
    return grs

@Test
def keyvalue_test(ctx):
    test_source = 'name: Luncert'
    ctx.test('keyvalue', test_source, requires=('STRING', ), tokens=True, trace=True)