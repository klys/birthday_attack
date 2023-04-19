const crypto = require('crypto');

const hashSet = new Set();

while (true) {
  const input = Math.random().toString();
  const hash = crypto.createHash('sha1').update(input).digest('hex');
  
  if (hashSet.has(hash)) {
    console.log(`Collision found for inputs ${input} and ${hashSet.get(hash)}`);
    break;
  }
  
  hashSet.add(hash);
}
