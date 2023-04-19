# Birthday Attack

The birthday paradox, also known as the birthday problem, is a probability theory problem that asks how many people you need in a room before there is a 50% chance that at least two people share the same birthday. The answer is surprisingly low: just 23 people.

In the context of cryptographic hash functions, like the SHA-1 algorithm, the birthday paradox can be used to attack the security of the function. Specifically, an attacker can use the birthday paradox to find collisions in the hash function, which means finding two inputs that produce the same hash output.

This different scripts generates random strings, hashes them using the SHA-1 algorithm, and stores the hashes in a set. If a collision is found (i.e., a hash that has already been seen), the program logs the collision and exits.

However, generating a collision using the birthday paradox requires generating a very large number of hashes. For SHA-1, the number of hashes needed to find a collision with a probability of 50% is around 2^80, which is far beyond the capabilities of current computers. In fact, SHA-1 has been shown to be vulnerable to collision attacks using the birthday paradox, and is no longer considered secure for cryptographic purposes. It's recommended to use a stronger hash function like SHA-256 or SHA-3 instead.