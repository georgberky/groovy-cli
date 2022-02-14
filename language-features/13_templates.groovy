#!/usr/bin/env groovy
def name
def template = """
Hallo ${-> name}
"""

name = "Softwerkskammer"

println template

name = "World"

println template
