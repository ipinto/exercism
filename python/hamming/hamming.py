import itertools


def distance(source, to):
    if len(source) != len(to):
        raise ValueError
    return sum(itertools.imap(str.__ne__, source, to))
