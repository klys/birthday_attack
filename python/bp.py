import hashlib
import random

hash_set = set()

while True:
    input_str = str(random.random())
    hash_val = hashlib.sha1(input_str.encode()).hexdigest()
  
    if hash_val in hash_set:
        print(f"Collision found for inputs {input_str} and {hash_set[hash_val]}")
        break
  
    hash_set.add(hash_val)
