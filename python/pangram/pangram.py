def is_pangram(sentence):
    sorted_ascii_codes = list(set([ord(letter) for letter in sentence.upper()]))
    try:
        return sorted_ascii_codes.index(ord('Z')) - sorted_ascii_codes.index(ord('A')) == ord('Z') - ord('A')
    except ValueError:
        return False
