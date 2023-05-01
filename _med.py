def validar_nota(a):
  ch = isinstance(a,str)
  if ch == True:
    return False
  elif a < 0 or a > 10:
    return False
  else:
    return True

def media(a,b):
  if validar_nota(a) == False or validar_nota(b) == False:
    return False

  else:
    media = ((a+b)/2)
    return media

