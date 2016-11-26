DNA_TO_RNA_MAPPING = {
    'G': 'C',
    'C': 'G',
    'T': 'A',
    'A': 'U'
}


def is_valid_dna(dna):
    return all(nucleotide in DNA_TO_RNA_MAPPING for nucleotide in dna)


def to_rna(dna):
    if not is_valid_dna(dna):
        return ''
    return ''.join([DNA_TO_RNA_MAPPING[nucleotide] for nucleotide in dna])
