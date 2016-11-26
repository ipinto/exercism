DNA_TO_RNA_MAPPING = {
    'G': 'C',
    'C': 'G',
    'T': 'A',
    'A': 'U'
}


def to_rna(dna):
    rna = ''
    for nucleotide in dna:
        if nucleotide in DNA_TO_RNA_MAPPING:
            rna += DNA_TO_RNA_MAPPING[nucleotide]
        else:
            return ''
    return rna
