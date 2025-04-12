<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:variable name="firstName" select="'Panish'"/>
    <xsl:template match="/catalog">
        <library>
            <xsl:for-each select="book">
                <book id="{@id}">
                    <author><xsl:value-of select="author"/></author>
                    <title><xsl:value-of select="title"/></title>
                </book>
            </xsl:for-each>
        </library>
    </xsl:template>
</xsl:stylesheet>
