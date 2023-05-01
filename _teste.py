import unittest
from _med import *

class SimpleTestCase(unittest.TestCase):

   #TEST NOTA_VALIDA
   def testA(self):
       self.assertFalse(validar_nota(11))
       self.assertFalse(validar_nota(-1))
       self.assertFalse(validar_nota("abc"))
       self.assertTrue(validar_nota(0))
       self.assertTrue(validar_nota(10))
       self.assertTrue(validar_nota(5))

   #TESTE MEDIA
   def testB(self):
       self.assertFalse(media("abc",5))
       self.assertFalse(media(8, "abc"))
       self.assertFalse(media(11, 5))
       self.assertFalse(media(5, 11))
       self.assertFalse(media(-4, 10))
       self.assertFalse(media(5, -6))
       self.assertEqual(media(5,5),5)
       self.assertEqual(media(10,0), 5)
       self.assertEqual(media(7.5, 9.5), 8.5)

if __name__ == "__main__":
   unittest.main()
