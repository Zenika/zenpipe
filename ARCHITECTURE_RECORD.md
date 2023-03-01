# zenpipe architecture record décision

**Zenpipe version 0.0.1**

- les sources qui sont dans src/main/java ont été générées a partir du fichier src/main/ressources/openapi.yaml (
  récupèré a partir du site pipedrive api).
- Certaines classes ont été modifiées à cause de l'incompabilité avec le fichier de spec yaml de pipedrive et openapi
  generator (notamment les déclarations des ENUM dans pipedrive api)
- Modifications des classes pour ajouter les customs fields qui n'existent pas dans openapi.yaml
- Ajouts des decoder et encoder pour gérer la sérialisation et désérialisation des custom fields

---