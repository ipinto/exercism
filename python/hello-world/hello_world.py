# -*- coding: utf-8 -*-


def hello(name='World'):
    return u'Hello, {}!'.format(name if name else 'World')
