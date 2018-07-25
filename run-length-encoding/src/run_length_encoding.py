from collections import defaultdict

def run_length_encode(string):
    """Encode raw string in format of 12A2B"""

    counter = defaultdict(int)

    for char in string:
        counter[char] += 1

    parts = [
        str(count), key
        for key, count in counter.items()
    ]

    return "".join(parts)     
